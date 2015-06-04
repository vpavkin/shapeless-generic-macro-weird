# "Incremental magic" example
This one doesn't compile when clean. But if you just comment out a line, compile and uncomment back - in, surprisingly, compiles!

More precisely:

```bash
sbt
clean
compile
# No luck
# Comment out line 2 in Main (val b)
compile
# It compiles!
# Uncomment line 2 back
compile
# Success. You can check in console, that Main.b is well-formed
```
