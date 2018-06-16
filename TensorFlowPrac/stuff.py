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
sess = tf.Session()
sess.run(x.initializer)
sess.run(y.initializer)
result = sess.run(f)
print(result)
sess.close()

'''
The above operation can be cumbersum (having to call run() all the time).
'''
with tf.Session() as sess:
    x.initializer.run()
    y.initializer.run()
    result = f.eval()
