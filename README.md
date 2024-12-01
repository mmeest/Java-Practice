# Git setup

If you like for example push practice solution also to your own git repository as a part of your portfolio.

1. Add second remote repository in terminal:

```
git remote add <remote-nimi> <remote-repo-URL>
```

Example: 

```
git remote add second-remote https://github.com/user/another-repo.git
```
---

To disable 'pull' and 'fetch' from your second repository

2. Set 'push' configuration:

```
git remote set-url --push second-remote https://github.com/user/another-repo.git
```

3. Restrict 'fetch' and 'pull' from second remote:

```
git remote set-url second-remote no-fetch://
``` 

Or manually in '.git/config':

```
[remote "second-remote"]
    url = no-fetch://
    fetch =
    pushurl = https://github.com/user/another-repo.git
```

---

4. Test to push to second remote:

```
git push second-remote <branch-nimi>
```

5. If you wish to push to onyl one remote:

```
git push <remote-nimi> <branch-nimi>
```

Example:

```
git push second-remote main
```

---

6. If you wish to check whitch remote your branch is connected:

```
git branch -vv
```

7. To change default remote:

```
git branch --set-upstream-to=<remote-nimi>/<branch-nimi>
```

----

8. To set parallel upload to both remotes:

```
git remote set-url --add --push origin https://github.com/user/another-repo.git
```

9. Check '.git/config':

```
[remote "origin"]
    url = https://github.com/user/original-repo.git
    fetch = +refs/heads/*:refs/remotes/origin/*
    pushurl = https://github.com/user/original-repo.git
    pushurl = https://github.com/user/another-repo.git
```

# Java Naming Conventions

## Upper Camel Case

Upper CamelCase is a convention where the first letter of each word is capitalized, including the first word. It is also known as PascalCase. The name PascalCase comes from the Pascal Programming Language, which was developed in the 1970s. Pascal was one of the first programming languages to support automatic capitalization of the first letter of words in variable and method names.

For example: MyClass, MyClass.java, BookAuthor, BookAuthor.java, etc. Upper CamelCase is also known as PascalCase. The name PascalCase comes from the Pascal Programming Language, which was developed in the 1970s. Pascal was one of the first programming languages to support automatic capitalization of the first letter of words in variable and method names.

In Java, CamelCase (starting with a capital letter), also known as PascalCase, is primarily used for the following elements:

Class Name Examples:

    MyClass

    BookAuthor

    Person

    OrderManager

Interface Name Examples:

    Runnable

    EventListener

    Comparable

    Serializable

Enum Name Examples:

    DayOfWeek

    Color

    SeverityLevel

---

## Lower Camel Case

Lower camelCase is a convention where the first letter of the first word is lowercase, and the first letter of each subsequent word is capitalized. This is commonly used for naming methods, variables, parameters, and fields in Java.

Method Name Examples:

    calculateTotal()

    printGreeting()

    isAvailable()

    getUserName()

Variable Name Examples:

    userName

    totalAmount

    currentIndex

    isConnected

Parameter Name Examples:

    public void setUserName(String userName)

    public int calculateSum(int number1, int number2)

    public boolean isAvailable(Date startDate, Date endDate)

Field Name (Instance Variable) Examples:

    private String userName;

    private int totalAmount;

    private boolean isActive;

Local Variable Examples:

    int itemCount = 0;

    String userInput = "";

    boolean isComplete = false;

By using lower camelCase for methods, variables, parameters, fields, and local variables, Java code becomes more readable and consistent, making it easier for developers to understand and maintain.

---

## Snake Case

snake_case is a convention where words are separated by underscores. It can be used in uppercase (UPPER_SNAKE_CASE) or lowercase (lower_snake_case) depending on the context.

## Upper Snake Case

UPPER_SNAKE_CASE is typically used for naming constants in Java. All letters are capitalized, and words are separated by underscores.

Constant Name Examples:

    MY_CONSTANT

    MIN_VALUE

    MAX_VALUE

    DEFAULT_TIMEOUT

    BASE_URL

## Lower Snake Case

lower_snake_case is often used for file names without a .java extension. All letters are lowercase, and words are separated by underscores.
File Name Examples (without .java extension):

    my_script.py

    config_file.xml

    data_file.csv

    data_file.json

---

## Kebab Case

kebab-case is a convention where all letters are lowercase and words are separated by hyphens. This is commonly used for naming URLs and RESTful API endpoints.

URL and RESTful API Endpoint Examples:

    my-website.com

    /api/v1/get-user

    /api/v1/set-data

    /resources/user-profile

By using UPPER_SNAKE_CASE for constants, lower_snake_case for file names, and kebab-case for URLs and API endpoints, Java code and resources become more readable and consistent, making it easier for developers to understand and maintain.

Clean code. https://www.youtube.com/watch?v=eVpwH1SPl1g

---

# Data Types

## Primitive Data Types

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java:

byte:

    Range: -128 to 127

        Example: byte age = 25;

short:

    Range: -32,768 to 32,767

        Example: short year = 2023;

int:

    Range: -2,147,483,648 to 2,147,483,647

        Example: int salary = 2000;

long:

    Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        Example: long distance = 9,876,543,210L;

float:

    Range: Approximately ±3.40282347 × 10^38 (7 decimal digits)

        Example: float temperature = 36.6f;

double:

    Range: Approximately ±1.79769313486231570 × 10^308 (15 decimal digits)

        Example: double pi = 3.14159;

char:

    Range: 0 to 65,535 (unsigned Unicode characters)

        Example: char letter = 'A';

boolean:

    Values: true or false

        Example: boolean isBlue = true;

## Non-primitive

Non-primitive data types in Java, also known as reference types, are more complex types that refer to objects and arrays. Unlike primitive data types, they are created by the programmer and can be used to store multiple values and more complex data structures. Non-primitive data types include Strings, Arrays, Classes, Interface, etc.

    String:

        Definition: A sequence of characters.

        Example: String greeting = "Hello, World!";

    Arrays:

        Definition: A container object that holds a fixed number of values of a single type.

        Example: int[] numbers = {1, 2, 3, 4, 5};

    Classes:

        Definition: Templates for creating objects and defining object data types and methods.

        Example: class Car { String color; String model; }

    Interfaces:

        Definition: Abstract types that allow the specification of methods that classes must implement.

        Example: interface Animal { void eat(); void sleep(); }

## Primitive vs Non-primitive

The main difference between primitive and non-primitive data types are:

    Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).

    Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.

    A primitive type has always a value, while non-primitive types can be null.

    A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
