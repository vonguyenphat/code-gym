import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HeaderComponent} from "./layout/header/header.component";
import {HeaderAdminComponent} from "./layout/header-admin/header-admin.component";
import {ListCustomerComponent} from "./furama/customer-furama/component-customer/list-customer/list-customer.component";
import {ListServiceComponent} from "./furama/service-furama/list-service/list-service.component";


const routes: Routes = [
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
