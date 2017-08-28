CREATE DATABASE IF NOT EXISTS videoPlayer;
USE videoPlayer;

###
# Category - Categories of videos and channels
#   
##
CREATE TABLE Category
(
    id              INTEGER     NOT NULL AUTO_INCREMENT,
	CategoryName   VARCHAR(70) NOT NULL,
    PRIMARY KEY (id)
);

###
# Video - All Videos present in the player
#   
##
CREATE TABLE Video
(
    id    INTEGER  NOT NULL AUTO_INCREMENT,
	VideoName   VARCHAR(70) NOT NULL,
    categoryID INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (categoryID) REFERENCES Category(id)
);

###
# Channel - Channel present in Player
#   
###
CREATE TABLE Channel
(
    channelID  INT NOT NULL,
    videoID       INT NOT NULL,
    PRIMARY KEY (channelID,videoID),
    channelName   VARCHAR(70) NOT NULL,
    categoryID INT NOT NULL,
    FOREIGN KEY (videoID) REFERENCES Video(id),
    FOREIGN KEY (categoryID) REFERENCES Category(id)
);

###
# PlayList - All playlists present in the player
#category
#   
##
CREATE TABLE PlayList
(
    id              INTEGER     NOT NULL AUTO_INCREMENT,
    playListID INTEGER     NOT NULL,
	playListName   VARCHAR(70) NOT NULL,
    videoID INTEGER     NOT NULL,
    channelID INTEGER     NOT NULL,
    FOREIGN KEY (channelID,videoID) REFERENCES Channel(channelID,videoID),
    PRIMARY KEY (id)
);