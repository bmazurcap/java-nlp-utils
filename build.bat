dir /s /B *.java > %cd%/src/sources.txt
javac -cp %cd%/junit-4.8.1.jar @%cd%/src/sources.txt -d %cd%/src/classes
