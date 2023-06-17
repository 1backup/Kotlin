val name: String? = null
val length: Int? = name?.length


*/
Safe Call Operator ?: 
  1. ensures that the expression is only executed if the object reference is not null.
  2. If the object is null, the entire expression evaluates to null instead of throwing a NullPointerException.

so safe call operator will make the value/object as nulll instaed of thowring an exception.
  */
