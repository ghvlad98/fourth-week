import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService<K> {
  constructor(private http: HttpClient) { }

  get(path: string): Observable<K> {
    return this.http.get<K>(path);
  }
  post(path: string, body: K): Observable<K> {
    return this.http.post<K>(path, body);
  }
  put(path: string, body: K): Observable<K> {
    return this.http.put<K>(path, body);
  }
  delete(path: string): Observable<K> {
    return this.http.delete<K>(path);
  }
}
/* single page application con toolbar sotto immagine con width=100% height:256px
  sotto 4 icone contatti, chi siamo, ...
  lista di altri valori a sinistra
  form a destra
  footer
  usare ngClass, ngStyle
*/