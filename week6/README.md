# Wallbreakers Week #6 
## Goals For This Week:

Students should be familiar with fundamental concepts of networking (TCP, UDP, sockets, async). Also students should know basics of multithreaded programming within context of different languages (Java, C, Python). Students should understand what locks, atomics and race conditions are. Students should have basic understanding of linux programming and its fundamental concepts: files, pipes, stdin/stdout, logging, virtual file systems (/dev/, /proc/), processes and threads, context switches and syscalls.

## Coding exercises
- [ ] Write a simple preforking echo server, without looking at the reference.
- [ ] Write a multithreaded merge-sort https://www.geeksforgeeks.org/merge-sort-using-multi-threading/

## Reading and videos

### Network
- https://jvns.ca/blog/2017/06/03/async-io-on-linux--select--poll--and-epoll/
- https://idea.popcount.org/2017-01-06-select-is-fundamentally-broken/
- https://www.youtube.com/watch?v=uwoD5YsGACg&vl=en
- https://www.howtogeek.com/190014/htg-explains-what-is-the-difference-between-tcp-and-udp/

### Python/Ruby
- https://tomayko.com/blog/2009/unicorn-is-unix
- https://gist.github.com/fuentesjr/240063
- https://wiki.python.org/moin/UdpCommunication

### Multithreading
- https://www.geeksforgeeks.org/mutex-vs-semaphore/
https://stackoverflow.com/questions/34510/what-is-a-race-condition
- https://www.sitepoint.com/dangers-race-conditions/
https://www.slashroot.in/difference-between-process-and-thread-linux
- Python
	- https://www.tutorialspoint.com/python/python_multithreading.htm
	- https://medium.com/@nbosco/multithreading-vs-multiprocessing-in-python-c7dc88b50b5b
	- https://docs.python.org/3/c-api/init.html#thread-state-and-the-global-interpreter-lock
- Java
	- https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/
	- https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/
	- https://winterbe.com/posts/2015/05/22/java8-concurrency-tutorial-atomic-concurrent-map-examples/
- File system
	- https://www.tecmint.com/explanation-of-everything-is-a-file-and-types-of-files-in-linux/
	- http://www.tldp.org/LDP/Linux-Filesystem-Hierarchy/html/dev.html
	- http://www.tldp.org/LDP/Linux-Filesystem-Hierarchy/html/proc.html