import smbclient

smb = smbclient.SambaClient()
f = smb.open('smb://filer1.neurospeed.com/upload/BLACKHAT')
data = f.read()
f.close()