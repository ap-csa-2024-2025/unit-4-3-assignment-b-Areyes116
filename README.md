[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17030680)
# unit-4-3-assignment-b

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

You will write a method named `isPrime` that returns a boolean, and that takes in a positive number and displays whether it is prime or not.  A number is prime if it is only divisible by 1 and itself.  Note that 1 is not prime.  Assume that the input is always greater than 0.

**Hint:** Assume the number is prime.  If you find out that it isn't prime, then set your answer to false.
**Alternative Hint:** You can take advantage of the fact that the `return` statement will end the execution of your code to return the correct value of `true` or `false` when you find out whether or not a number is prime or not.

To help you, I highly suggest you test a few numbers, and do it "manually" as a "human being" to help you figure out how you would create an algorithm that you would program as Java code.

| Input | Expected Output |
| --- | ---|
| 1 | `false` |
| 2 | `true` |
| 3 | `true` |
| 4 | `false` |
| 5 | `true` |
| 8675309| `true` |

## Sample Solutions
```java
public static boolean isPrime(int N)
{
  if (N == 1)
  {
    return false;
  }

  for (int i = 2; i < N; i++)
  {
    if (N % i == 0)
    {
      return false;
    }
  }
  return true;
}

// Alternative solution

public static boolean isPrime(int N)
{
  boolean output = true;
  for (int i = 2; i < N; i++)
  {
    if (N % i == 0)
    {
      output = false;
    }
  }

  if (N == 1)
  {
    output = false;
  }
  return output;
}
```
