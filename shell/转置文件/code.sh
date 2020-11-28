line=`cat file2.txt | awk '{print NF}' | head -n 1` #`是命令行替换
#echo $line

#for i in (seq 1 $line);
for i in $(seq 1 $line);
do
  #cat file2.txt | awk -v i=$i '{print $i}'
  cat file2.txt | awk -v i=$i '{print $i}' | xargs
done
