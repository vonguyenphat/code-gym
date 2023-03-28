import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { ListServiceComponent } from './furama/service-furama/list-service/list-service.component';
import { ListCustomerComponent } from './furama/customer-furama/component-customer/list-customer/list-customer.component';
import { HeaderAdminComponent } from './layout/header-admin/header-admin.component';
import { HomeComponent } from './furama-client/home/home.component';
import { ServiceFuramaClinetComponent } from './furama-client/service-furama-clinet/service-furama-clinet.component';
import {NgbAlertModule, NgbModule, NgbPaginationModule} from '@ng-bootstrap/ng-bootstrap';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { DeleteProductModalComponentComponent } from './furama/service-furama/delete-product-modal-component/delete-product-modal-component.component';
import { EditServiceModalComponentComponent } from './furama/service-furama/edit-service-modal-component/edit-service-modal-component.component';
import { CreateCustomerComponent } from './furama/customer-furama/component-customer/create-customer/create-customer.component';
import { UpdateCustomerComponent } from './furama/customer-furama/component-customer/update-customer/update-customer.component';
import { DeleteCustomerComponent } from './furama/customer-furama/component-customer/delete-customer/delete-customer.component';
import {HttpClientModule} from "@angular/common/http";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ListServiceComponent,
    ListCustomerComponent,
    HeaderAdminComponent,
    HomeComponent,
    ServiceFuramaClinetComponent,
    DeleteProductModalComponentComponent,
    EditServiceModalComponentComponent,
    CreateCustomerComponent,
    UpdateCustomerComponent,
    DeleteCustomerComponent,
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    NgbPaginationModule,
    NgbAlertModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
