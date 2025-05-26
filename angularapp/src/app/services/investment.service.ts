import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs/dist/types';
import { Observable } from 'rxjs';
import { Investment } from '../models/investment.model';
@Injectable({
  providedIn: 'root'
})
export class InvestmentService {
  //8080-efeaacabbaccabebbbcdcabddbecbfafbcf.project.examly.io
  private apiUrl='http://8080-efeaacabbaccabebbbcdcabddbecbfafbcf.project.examly.io/api/investments';

  constructor(private http:HttpClient) { }

  getAllInquiries():Observable<Investment[]>{
    return this.http.get<Investment[]>(this.apiUrl);
  }

  addInquiry(inquiry:Investment):Observable<Investment>{
    return this.http.post<Investment>(this.apiUrl,inquiry)
  }

  getInquiryById(id:number):Observable<Investment>{
    return this.http.get<Investment>(`${this.apiUrl}/${id}`)
  }

  updateInquiry(id:number,inquiry:Investment):Observable<Investment>{
    return this.http.put<Investment>(`${this.apiUrl}/${id}`,inquiry)
  }

  deleteInquiryById(id:number):Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`)
  }  

}
