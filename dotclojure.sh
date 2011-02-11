#!/bin/sh
FILE=.clojure.tmp
OUT=.clojure
echo 'src' > $FILE
echo 'resources' >> $FILE
find lib -name '*.jar'  >> $FILE
cat $FILE | tr '\n' ':' > $OUT
rm $FILE
