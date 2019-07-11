import React, { Component } from 'react';
import EmployeeGrid from './EmployeeGrid';

export const log = message => console.log(message);
export const EMPLOYEES_API_URL = 'http://localhost:8080/employees';

export default class Employee extends Component {

    constructor() {
        super();
        this.state = {
            employees: [],
        };
    }

    fetchData(api_url) {
       return fetch(api_url)
            .then(response => response.json())
            .then(data => {
               return data;
        });
    }


    componentWillMount() {
        this.fetchData(EMPLOYEES_API_URL).then(response => {
            this.setState({
                employees: response,
            });
        });
    }

    render() {
        log("Employee render called");
        let employees = this.state.employees;
        
        return (
            <div className='col-md-5 order-md-1'>
                <h3>Employee Data </h3>
                <hr/>
                <EmployeeGrid  employees={this.state.employees}/>
            </div>
        );
    }
}