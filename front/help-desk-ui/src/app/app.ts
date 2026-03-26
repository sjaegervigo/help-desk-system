import { Component, OnInit, Signal, signal } from '@angular/core';
import { Ticket } from './models/ticket.model';
import { TicketService } from './services/ticket.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [CommonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App implements OnInit {
  tickets = signal<Ticket[]>([]);
  protected readonly title = signal('help-desk-ui');

  constructor(private ticketService: TicketService) {}

  ngOnInit(): void {
    this.obtenerTickets();
  }
  

  obtenerTickets(){
    this.ticketService.getTickets().subscribe({
      next: (data) => {
        this.tickets.set(data);
        console.log('Tickets recibidos:', data);
    },
    error: (err) => console.error('Error al conectar con Java: ', err)
  });  
  }
}
