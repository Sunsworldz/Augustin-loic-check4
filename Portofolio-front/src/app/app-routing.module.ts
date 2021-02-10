import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { HomePageComponent } from './home-page/home-page.component';
import { TestimoniesPageComponent } from './testimonies-page/testimonies-page.component';
import { WorkPageComponent } from './work-page/work-page.component';

const routes: Routes = [
  {
    path:'',
    component: HomePageComponent
  },
  {
    path:'Work',
    component: WorkPageComponent
  },
  {
    path:'Testimonies',
    component: TestimoniesPageComponent
  },
  {
    path:'Contact',
    component: ContactComponent
  },

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
