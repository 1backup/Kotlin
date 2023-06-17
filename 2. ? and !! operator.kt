// ? (Safe Call Operator)
val name: String? = null
val length: Int? = name?.length

/*
Safe Call Operator ?: 
  1. ensures that the expression is only executed if the object reference is not null.
  2. If the object is null, the entire expression evaluates to null instead of throwing a NullPointerException.
so safe call operator will make the value/object as nulll instaed of thowring an exception.
  */

  
// Not-null Assertion Operator !!
 val name: String? = null
val length: Int = name!!.length

/* 
Not-null Assertion Operator !! : 
  1.  used to assert that a nullable object reference is not null.
  2. tells the compiler that you are confident the object is not null at that particular point in the code.
  3. If the object reference is null, a NullPointerException is thrown at runtime.
  */


not-null assertion operator !! provides a way to bypass null safety checks, it should be used cautiously. 
It's generally recommended to use safe calls (?) or other null safety techniques to handle nullability and prevent unexpected crashes in your code.
