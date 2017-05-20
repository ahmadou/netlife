import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class PerduService {

  constructor(private _http: Http) { }

  public getChildren() {
    return this._http.get("/home/pictime/IdeaProjects/netlife/src/main/webapp/src/app/perdu/children.json")
      .toPromise();
  }

}
