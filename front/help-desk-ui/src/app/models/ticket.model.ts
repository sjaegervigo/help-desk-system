export interface Ticket {
    id?: number;
    titulo: string;
    descripcion: string;
    estado?: string;
    prioridad: string;
    fechaCreacion?: string;    
}