import { Injectable } from '@angular/core';
import 'rxjs/add/operator/toPromise';
import {Http} from "@angular/http";

@Injectable()
export class MagasinService {

  constructor(private _http: Http) { }

  public getChildren() {
    return this._http.get("/api/child")
      .toPromise();
  }

  public getProducts() {
    return this._http.get("/api/products")
      .toPromise();
  }

}
