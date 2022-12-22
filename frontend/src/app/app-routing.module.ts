import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ModelingToolsComponent} from './components/modeling-tools/modeling-tools.component';

const routes: Routes = [
  {path: '', component: ModelingToolsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
