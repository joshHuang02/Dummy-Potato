recursion(node startNode, int[] values, int j, bool back) {
  values[j] = startNode->data;  
  if (startNode->next == NULL) {
    j = 0;
    back = true;
  }

  if (back) startNode->data = values[j];

  return recursion(node, values, j ++, back);
}

node reverse(node startNodeNode) {
  int i = 0;
  while (startNode->next != NULL) {
    i ++;
  }
  int[] values = alloc_array(int, i + 1);

  int j = 0;
  recursion(startNode, values, j, false)
}