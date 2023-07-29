## Docker 
### How To Install on Ubuntu :

1.Set up docker's Package Repository
<pre> sudo apt-get update
 sudo apt-get install ca-certificates curl gnupg</pre> 
 ![image](1.png)
<br>

2.Add Docker's GPG key:
<pre>sudo install -m 0755 -d /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
sudo chmod a+r /etc/apt/keyrings/docker.gpg</pre>
 ![image](2.png)
 
3.Set up the repository:
<pre>echo \
  "deb [arch="$(dpkg --print-architecture)" signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  "$(. /etc/os-release && echo "$VERSION_CODENAME")" stable" | \
  sudo tee /etc/apt/sources.list.d/docker.list > /dev/null</pre>
 
 ![image](5.png)
 
 <br>
 4.Update using apt <br>
 5.Install the docker plugins:
 <pre>sudo apt-get install docker-ce docker-ce-cli containerd.io docker-buildx-plugin docker-compose-plugin</pre>
 
  ![image](3.png)
  
  6.Verify that its properly installed by running hello-world image:
  <pre>sudo docker run hello-world</pre>
  
  ![image](4.png)
  
  6.Download the .deb file and update the system ,then install the docker-desktop .deb file:<pre>sudo apt-get update
sudo apt-get install ./docker-desktop-version.arch.deb</pre>

   ![image](6.png)
   
 
  ### Now docker-engine will be properly installed..