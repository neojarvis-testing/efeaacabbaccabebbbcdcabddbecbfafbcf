import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminAddInvestmentComponent } from './components/admin-add-investment/admin-add-investment.component';
import {HttpClientModule} from '@angular/common/http' ;

@NgModule({
  declarations: [
    AppComponent,
    AdminAddInvestmentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
