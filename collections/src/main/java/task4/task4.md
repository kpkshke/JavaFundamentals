|       	|                                                                                      Basic functionality                                                                                     	|                         Examples of usage                        	|
|:-----:	|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:	|:----------------------------------------------------------------:	|
|  Set  	|                                                         boolean add(E element); boolean remove(Object o); boolean contains(Object o)                                                         	|                      Storing unique elements                     	|
|  List 	|       boolean add(E element); void add(int index, E element); boolean remove(Object o); E remove(int index); E get(int index); E set(int index, E element); boolean contains(Object o);      	| Storing elements that can have duplicates, quick access by index 	|
| Queue 	|                                                boolean add(E element); boolean offer(E element); E remove(); E poll(); E element(); E peek();                                                	|                      Implementation of FIFO                      	|
|  Map  	| V put(K key, V value); V get(Object key); boolean containsKey(Object key); boolean containsValue(Object value); V remove(Object key); Set keySet();boolean remove(Object key, Object value); 	|                      Storing key-value pairs                     	|