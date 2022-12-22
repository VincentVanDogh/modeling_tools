import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ModelingTool} from '../dtos/modeling-tool';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ModelingToolsService {

  constructor(
    private http: HttpClient
  ) { }

  /**
   * Requests a list of all modeling tools stored in the system
   *
   * @return an observable of all modeling tools
   */
  public getModelingTools(): Observable<ModelingTool[]> {
    this.http.get<ModelingTool[]>(environment.modelingToolUrl).subscribe({
      next: data => {
        console.log(data);
      }
    });
    return this.http.get<ModelingTool[]>(environment.modelingToolUrl);
  }

  /**
   * Requests a modeling tool with a corresponding ID
   *
   * @param id ID of the modeling tool
   * @return an observable modeling tool
   */
  public getModelingTool(id: number): Observable<ModelingTool> {
    return this.http.get<ModelingTool>(`${environment.modelingToolUrl}id`);
  }

  /**
   * Posts a new modeling tool to the system
   *
   * @param tool Modeling Tool expected to be stored
   * @return an observable of the sent Modeling Tool
   */
  public sendModelingTool(tool: ModelingTool): Observable<ModelingTool> {
    return this.http.post<ModelingTool>(environment.modelingToolUrl, tool);
  }
}
