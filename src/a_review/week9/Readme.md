# Week 9 - ArrayList 
### November 14 2020
===============================================

Wrapper class: Object representation of primate datatypes 
    
    Autoboxing: Convert the primate datatype to an object wrapper class
        Integer n = 10;
        int n2 = 50;
        Integer n3 = n2;
    Unboxing: Convert the wrapper class object to a primate datatype
        int a = new Integer(30);
        Double d1 = new Double(3.14);
        double d2 = d1;
    Other use cases:
        - MAX_VALUE or MIN_VALUE
        - methods: 
            parse   -> returns int value
            valueOf -> return Integer value
            Ex: parseInt("4")
            isLetter
            isDigit 
---------------------------------------------------------------
Math class: Useful methods for math operations
                -> abs   | -4 | -> 4
        ex: Math.abs(-10) -> 10
Var args: Allow the method to accept number directly as arguments and those numbers are taken as elements in an array 
---------------------------------------------------------------
ArrayList: A collection that works similar to arrays, but the ArrayList is more dynamic. The size is flexible and there's also some method that will modify our collection
    -> Cannot store primate datatypes, use wrapper classes for the element datatypes  
    -> Syntax:
        ArrayList <dataTypeOfElements> varName = new ArrayList<>();
    -> methods:
        add(element) | add(index, element)
        remove(element) | remove(index)
        get()
        set()
        size() 
        clear()
        contains()
        indexOf()
        equals()
        toString()
        addAll(Collection type)
        containsAll(Collection type)
        removeAll(Collection type)
===============================================
