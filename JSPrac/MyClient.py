#It might be a good idea to have this concurrently communicate with the MyServer.
#Doesn't have to be fancy, I could have my client have click among 3 buttons, where
#one pops a triangle, one pops a circle, and one pops a rectangle......
#but you don't need Node.js to do things like that.
import urllib.request;
import webbrowser
from urllib.request import Request

req = Request("http://localhost:8080/Trunks.jpg");
response = urllib.request.urlopen(req);
webbrowser.open(response.url);
print(response.getheaders());