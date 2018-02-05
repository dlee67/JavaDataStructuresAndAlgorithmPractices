contract Proof 
{ 
    struct FileDetails 
    { 
        uint timestamp; 
        string owner; 
    } 

    mapping (string => FileDetails) files; 

    event logFileAddedStatus(bool status, uint timestamp, string owner, string fileHash); 

    //this is used to store the owner of file at the block timestamp 
    function set(string owner, string fileHash) 
    { 
        //There is no proper way to check if a key already exists or not therefore we are checking for default value i.e., all bits are 0 
        if(files[fileHash].timestamp == 0) 
        { 
            files[fileHash] = FileDetails(block.timestamp, owner); 

            //we are triggering an event so that the frontend of our app knows that the file's existence and ownership details have been stored 
            logFileAddedStatus(true, block.timestamp, owner, fileHash); 
        } 
        else 
        { 
            //this tells to the frontend that file's existence and ownership details couldn't be stored because the file's details had already been stored earlier 
            logFileAddedStatus(false, block.timestamp, owner, fileHash); 
        } 
    } 

    //this is used to get file information 
    function get(string fileHash) returns (uint timestamp, string owner) 
    { 
        return (files[fileHash].timestamp, files[fileHash].owner); 
    } 
} 