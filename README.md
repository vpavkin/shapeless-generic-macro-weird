# "Change file order" example

This one compiles smoothly, I guess, because `Example` goes before `Main`.
Just rename `Example` to `SomeObject` and you'll get a compile error.

More precisely:
```bash
sbt
clean
compile
# Here you can check in console, that Main.b is well-formed
clean
# Rename Example.scala to SomeObject.scala
compile
# Boom, implicit is not resolved
```
