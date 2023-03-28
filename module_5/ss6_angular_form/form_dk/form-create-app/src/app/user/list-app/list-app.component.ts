import { Component, OnInit } from '@angular/core';
import {User} from "../../model/user";

@Component({
  selector: 'app-list-app',
  templateUrl: './list-app.component.html',
  styleUrls: ['./list-app.component.css']
})
export class ListAppComponent implements OnInit {
  users: User[] = [];
  constructor() {
    this.users.push({email:"vo@gmail.com",password:"12345",country:"Nông Sơn",age:19,gender: true,phone:"848912361231"});
    this.users.push({email:"vo@gmail.com",password:"12345",country:"Nông Sơn",age:19,gender: false,phone:"848912361231"});
    this.users.push({email:"vo@gmail.com",password:"12345",country:"Nông Sơn",age:19,gender: true,phone:"848912361231"});
    this.users.push({email:"vo@gmail.com",password:"12345",country:"Nông Sơn",age:19,gender: true,phone:"848912361231"});
  }
  ngOnInit(): void {
  }

}
