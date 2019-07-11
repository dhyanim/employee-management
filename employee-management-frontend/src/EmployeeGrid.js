import React from 'react';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';

export default class EmployeeGrid extends React.Component {

  dateFormatter(cell) {
    var formattedDate = new Date(cell);
    var options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
    return formattedDate.toLocaleDateString("en-US", options);
  }

  render() {
    return (
      <div>
      <BootstrapTable data={this.props.employees } >
          <TableHeaderColumn dataField="id"  isKey={ true }>Id</TableHeaderColumn>
          <TableHeaderColumn dataField="employeeName"> Name</TableHeaderColumn>
          <TableHeaderColumn dataField="salary" dataSort={true}> Salary</TableHeaderColumn>
          <TableHeaderColumn dataField="hireDate" dataFormat={this.dateFormatter} >Hire Date</TableHeaderColumn>
      </BootstrapTable>
      </div>
    );
  }
}
