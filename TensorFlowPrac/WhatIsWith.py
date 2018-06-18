class Saved():
    def __init__(self, cr):
        self.cr = cr
    def __enter__(self):
        self.cr.save()
        return self.cr
    def __exit__(self, type, value, traceback):
        self.cr.restore()

for i in xrange(6):
    with Saved(i):
        f.write("Wow, wrote something.")
