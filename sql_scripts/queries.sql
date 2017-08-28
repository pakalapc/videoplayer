USE videoPlayer;

insert into category values(1,"Rap");
insert into category values(2,"Pop");
insert into category values(3,"Country");

insert into video values(1,"SomeRapSong",1);
insert into video values(2,"SomePopSong",2);
insert into video values(3,"SomeRapSong2",1);
insert into video values(4,"SomePopSong2",2);

insert into channel values(1,1,"RapChannel",1);
insert into channel values(1,2,"RapChannel",1);
insert into channel values(1,3,"RapChannel",1);
insert into channel values(1,4,"RapChannel",1);
insert into channel values(2,1,"PopChannel",2);
insert into channel values(2,2,"PopChannel",2);
insert into channel values(2,3,"PopChannel",2);
insert into channel values(3,1,"CountryChannel",3);

insert into playlist values(6,3,"playListC",3,1);
insert into playlist values(1,1,"playListA",1,1);
insert into playlist values(2,1,"playListA",1,2);
insert into playlist values(3,1,"playListA",1,3);
insert into playlist values(4,2,"playListB",2,1);
insert into playlist values(5,2,"playListB",2,2);

select * from playlist;
select * from channel;
select * from video;
select * from category;

#Q4)
select channelName,VideoName from channel join Video on Channel.videoID = Video.id Order by Channel.channelID;

 #Q5     
select channelID,count(channelID)
from channel
group by channelID having  (count(channelID) = (select max(a.num) from (select count(channelID) as num from channel group by channelID) a)
OR count(channelID) = (select min(a.num) from (select count(channelID) as num from channel group by channelID) a))
;

#Q6
select playListName,VideoName from playList join Video on playList.videoID = Video.id Order by playList.playListID;





