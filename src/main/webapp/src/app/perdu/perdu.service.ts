import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class PerduService {

  constructor(private _http: Http) { }

  public getChildren() {
    return this._http.get("/api/child")
      .toPromise();
  }

}
