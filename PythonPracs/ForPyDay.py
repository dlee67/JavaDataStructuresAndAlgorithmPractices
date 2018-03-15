import numpy as np
import matplotlib.pyplot as plt

points = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3, 2, 3]
x = np.arange(points.size())

plt.bar(x, points)
plt.show()
