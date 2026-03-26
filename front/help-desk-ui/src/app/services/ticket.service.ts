import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Ticket } from '../models/ticket.model';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root',
})
export class TicketService {

  private apiUrl = 'http://localhost:8080/api/tickets';

  constructor(private http: HttpClient) { }

  getTickets() : Observable<Ticket[]> {
    return this.http.get<Ticket[]>(this.apiUrl);
  }

  saveTicket(ticket: Ticket) : Observable<Ticket> {
    return this.http.post<Ticket>(this.apiUrl, ticket);
  }
}
