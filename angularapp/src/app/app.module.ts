import { NgModule } from '@angular/core';

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
  
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
