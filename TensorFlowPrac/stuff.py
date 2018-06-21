'''
TensorFlow seemed to have it's own way of doing things, when compare to other
development paradigm. Everything that I create (like, variables), they have
to be passed on to this function called run(), but before run() is called,
Session() needs to be called.
'''
import tensorflow as tf

x = tf.Variable(3, name ="x")
y = tf.Variable(4, name="y")
f = x*x*y + y + 2
init = tf.global_variables_initializer()
#sess = tf.Session()
#sess.run(x.initializer)
#sess.run(y.initializer)
#result = sess.run(f)
#print(result)
#sess.close()

'''
The above operation can be cumbersum (having to call run() all the time).
So, the tf object holds all the Operation objects (for example,
the tf.Variables must be passed to run function, and tf objects
only evalutes whatever state it has.
with tf.Session() as sess:
    x.initializer.run()
    y.initializer.run()
    result = f.eval()
print(result)
'''

with tf.Session() as sess:
    init.run()
    result = f.eval()
    print(result)

#So, tensorflow has this concept called Graph, and it's where all the
#mutable states reside (it seems like it).
graph = tf.Graph()
with graph.as_default():
    x2 = tf.Variable(2)
    print(x2)

'''
    Tensorflow has this concept called Nodes, where Nodes are the contents
    which makes up the graph within the Tensorflow to be evaluated.
'''
w = tf.constant(2)
x = w + 2
y = x + 5
z = x * 3
with tf.Session() as sess:
    print(y.eval())
    print(z.eval())
