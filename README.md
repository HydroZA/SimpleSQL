# Welcome to the SimpleSQL Wiki!
## Contents
1. Introduction
2. Syntax
3. Execution of SQLite3
4. Validation

## Introduction
***

SimpleSQL is a simpler alternative to the popular database query language SQL. SimpleSQL outputs Bash files which relies on SQLite3. SimpleSQL first translates your model to SQL, then generates a bash script with the relevant Bash commands to execute the SQL.

## Syntax
***
### Create Database
Every SimpleSQL model must start with a `begin database <name>` statement. This can either be an existing SQLite3 database file that you wish to alter, or a new database.

### Create Table
After creating the database, we can now begin creating tables. This is done using the command 

```
create new table <name> with columns (
    <column name> with type [string | int | decimal | date]`
)
```

Example:
```
create new table catalogue in Store with columns (
	product with type string
	price with type decimal
)
```
You can now supply SimpleSQL with a selection of Statements. These statements support the standard CRUD operations seen in traditional SQL, however with a more intuitive syntax.

### SELECT statement 
The SELECT statement used to retrieve records from one or more tables in the SQL. The command for such procedure is:

```
select <name> from <table> (
   where <column>
   "if"
   order by <column> type [asc | desc]
   "if"
   group by <column_name>
)
```
What's special about this SELECT statement, is that it can inherit other syntax's to further enhance and expand the results effectively. The WHERE statement allows the use of locating a specified column in the SQL database that was created. GROUP BY allows with the support of some functions, group related data into classes. i.e., if a column has the same values in different rows, it would group all rows together. Where as for ORDER BY selecting or sorting the list of results, in ascending or descending order.

### UPDATE statement 
The use of the UPDATE statement allows to modify or alter an existing record within the table that is being currently used. To apply this statement can be shown below:

```
update table (
   update <table>
   set <name>
)
```
### DELETE statement
The DELETE statement in SQL can allow one or more documents/records from a table are deleted A condition can be used to specify a subset for deletion; otherwise, all records are deleted. Below will show the command:

```
delete table (
   delete from <table>
   where <column>
)
```
### INSERT statement 
The VALUES keyword is used to INSERT one record into a table. Let's take a look at a SQL definition of how to do this. In this case, one record will be added to the categories table. If further columns are added to the categories table, the INSERT argument will fail. The command will shown below:

```
insert into table (
   values <data>
)
```

## Execution of SQLite3
***
