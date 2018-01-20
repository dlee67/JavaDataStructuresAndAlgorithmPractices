import urllib.request;
import webbrowser
from urllib.request import Request

req = Request("http://localhost:8080");
response = urllib.request.urlopen(req);
webbrowser.open(response.url);