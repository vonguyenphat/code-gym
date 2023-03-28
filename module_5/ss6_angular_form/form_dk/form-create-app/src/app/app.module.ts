import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {ReactiveFormsModule} from "@angular/forms";
import {CreateAppComponent} from "./user/create-app/create-app.component";
import {ListAppComponent} from "./user/list-app/list-app.component";

@NgModule({
  declarations: [
    AppComponent,
    CreateAppComponent,
    ListAppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
