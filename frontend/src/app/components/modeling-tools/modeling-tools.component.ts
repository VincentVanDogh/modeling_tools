import { Component, OnInit } from '@angular/core';
import {CheckedModelingToolColumns, ModelingTool, ModelingToolSearch} from '../../dtos/modeling-tool';
import {ModelingToolsService} from '../../services/modeling-tools.service';
import {ModalDismissReasons, NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-modeling-tools',
  templateUrl: './modeling-tools.component.html',
  styleUrls: ['./modeling-tools.component.scss']
})
export class ModelingToolsComponent implements OnInit {
  modelingTools: ModelingTool[] = [];
  modelingToolSearch: ModelingToolSearch = {};
  modelingToolsFiltered: ModelingTool[] = [];
  modelingToolCreate: ModelingTool = {
    name: '',
    link: ''
  };
  checkedColumns: CheckedModelingToolColumns = {
    appFramework: true,
    category: true,
    creator: true,
    license: true,
    loginRequired: true,
    openSource: true,
    os: true,
    programmingLanguage: true
  };
  closeResult: string;

  constructor(
    private service: ModelingToolsService,
    private modalService: NgbModal
  ) { }

  ngOnInit(): void {
    this.reloadModelingTools();
    // this.modelingTools = modelingToolsFile;
  }

  reloadModelingTools() {
    this.service.getModelingTools().subscribe({
      next: data => {
        this.modelingTools = data;
        this.modelingToolsFiltered = data;
      },
      error: err => {
        console.log('Error fetching modeling tools', err);
        if (err.status === 0) {
          console.log('Is the backend up?');
        }
      }
    });
  }

  /**
   * Filters Modeling Tools that fit the filtering options
   */
  searchModelingTool(): void {
    this.modelingToolsFiltered = [];
    for (const tool of this.modelingTools) {
      if (
        (this.contains(this.modelingToolSearch.name, tool.name)) &&
        (this.modelingToolSearch.openSource === undefined || this.modelingToolSearch.openSource === tool.openSource) &&
        (this.contains(this.modelingToolSearch.appFramework, tool.appFramework)) &&
        (this.modelingToolSearch.webApp === undefined || this.modelingToolSearch.webApp === tool.webApp) &&
        (this.modelingToolSearch.desktopApp === undefined || this.modelingToolSearch.desktopApp === tool.desktopApp) &&
        (this.contains(this.modelingToolSearch.category, tool.category)) &&
        (this.modelingToolSearch.loginRequired === undefined || this.modelingToolSearch.loginRequired === tool.loginRequired) &&
        (this.contains(this.modelingToolSearch.creator, tool.creator))
      ) {
        this.modelingToolsFiltered.push(tool);
      }
    }
  }

  /**
   *
   * @param keyword Substring expected to be contained within the string
   * @param string String of characters which may or may not contain a keyword
   *
   * Returns true if the keyword's character in the given order are within the string
   */
  contains(keyword: string | undefined, string: string | undefined): boolean {
    if (keyword === undefined || string === undefined || keyword.length === 0) {
      return true;
    }
    if (keyword.length > string.length) {
      return false;
    }
    let k = 0;
    for (const entry of string) {
      if (entry.toLowerCase() === keyword[k].toLowerCase()) {
        k++;
      } else {
        k = 0;
      }
      if (k === keyword.length) {
        return true;
      }
    }
    return false;
  }

  open(content: any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  onSubmit(form: NgForm) {
    console.log(form.form.value);
    this.service.sendModelingTool(this.modelingToolCreate).subscribe({
      next: data => {
        this.reloadModelingTools();
      },
      error: err => {
        console.log(err);
      }
    });

    this.modelingToolCreate = {link: '', name: ''};
    this.modalService.dismissAll();
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  /*
  onSubmit(): void {
    this.modelingTools.push(this.modelingToolCreate);
  }
   */

  /**
   *
   * @param link to the website of the modeling tool provider
   *
   * Redirects a user to the page of the link he/she have clicked on
   */
  redirect(link: string): void {
    window.location.href = link;
  }
}
