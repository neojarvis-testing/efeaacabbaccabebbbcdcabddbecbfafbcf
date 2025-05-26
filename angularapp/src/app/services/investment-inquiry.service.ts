import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/dist/types';
import { InvestmentInquiry } from '../models/investment-inquiry.model';

@Injectable({
  providedIn: 'root'
})
export class InvestmentInquiryService {
  private apiUrl='http://localhost:8080/api/investment-inquiries';

  constructor(private http:HttpClient) { }

  getAllInquiries():Observable<InvestmentInquiry[]>{
    return this.http.get<InvestmentInquiry[]>(this.apiUrl);
  }

  addInquiry(inquiry:InvestmentInquiry):Observable<InvestmentInquiry>{
    return this.http.post<InvestmentInquiry>(this.apiUrl,inquiry)
  }

  getInquiryById(id:number):Observable<InvestmentInquiry>{
    return this.http.get<InvestmentInquiry>(`${this.apiUrl}/${id}`)
  }

  updateInquiry(id:number,inquiry:InvestmentInquiry):Observable<InvestmentInquiry>{
    return this.http.put<InvestmentInquiry>(`${this.apiUrl}/${id}`,inquiry)
  }

  deleteInquiryById(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`)
  }  






}
