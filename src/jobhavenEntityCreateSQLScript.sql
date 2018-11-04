-- ****************** Jobhaven Database entity Create sql ******************;
-- ***************************************************;


-- ************************************** `Users`

CREATE TABLE `Users`
(
 `userId`     int NOT NULL ,
 `username`   varchar(30) NOT NULL ,
 `password`   varchar(150) NOT NULL ,
 `accountRef` varchar(20) NOT NULL ,
PRIMARY KEY (`userId`)
);






-- ************************************** `skills`

CREATE TABLE `skills`
(
 `skillId`    int NOT NULL ,
 `skillName`  varchar(45) ,
 `skillLevel` varchar(45) ,
 `skillType`  varchar(45) ,
 `period`     int ,
PRIMARY KEY (`skillId`)
);






-- ************************************** `JobType`

CREATE TABLE `JobType`
(
 `jobTypeId`     int NOT NULL ,
 `jobTypeRef`    varchar(20) NOT NULL ,
 `jobTypeName`   varchar(45) NOT NULL ,
 `jobTypePeriod` int NOT NULL ,
PRIMARY KEY (`jobTypeId`)
);






-- ************************************** `Industries`

CREATE TABLE `Industries`
(
 `IId`          int NOT NULL ,
 `IndustryName` varchar(45) ,
 `industryRef`  varchar(45) ,
PRIMARY KEY (`IId`)
);






-- ************************************** `Experinces`

CREATE TABLE `Experinces`
(
 `xpId`             int NOT NULL ,
 `xpRef`            varchar(20) ,
 `cvRef`            varchar(20) ,
 `xpJobTitle`       varchar(20) ,
 `companyName`      varchar(45) ,
 `levelOfExperince` varchar(50) ,
 `period`           varchar(10) ,
PRIMARY KEY (`xpId`)
);






-- ************************************** `Education`

CREATE TABLE `Education`
(
 `educationId`        int NOT NULL ,
 `cvRef`              varchar(20) ,
 `attrName`           varchar(45) ,
 `attrValues`         varchar(45) ,
 `highestGradePassed` varchar(45) ,
 `highSchoolName`     varchar(45) ,
 `allSubjectPassed`   varchar(450) ,
 `universityName`     varchar(45) ,
 `isUniversityPassed` varchar(10) ,
 `startDate`          date ,
 `endDate`            date ,
PRIMARY KEY (`educationId`)
);






-- ************************************** `Applied`

CREATE TABLE `Applied`
(
 `appliedId`  int NOT NULL ,
 `accountRef` varchar(45) NOT NULL ,
 `firstname`  varchar(45) NOT NULL ,
 `LastName`   varchar(45) NOT NULL ,
 `savedJobs`  varchar(45) NOT NULL ,
PRIMARY KEY (`appliedId`)
);






-- ************************************** `Actions`

CREATE TABLE `Actions`
(
 `actionId`          int NOT NULL ,
 `actionRef`         varchar(20) NOT NULL ,
 `accountref`        varchar(20) ,
 `actionDescription` varchar(150) ,
 `createdDate`       datetime ,
 `startDate`         datetime ,
 `activatedDate`     datetime ,
 `loginTemp`         varchar(45) ,
 `attrName`          varchar(45) ,
 `attrValue`         varchar(45) ,
PRIMARY KEY (`actionId`)
);






-- ************************************** `AccountType`

CREATE TABLE `AccountType`
(
 `accountTypeId` int NOT NULL ,
 `typeRef`       varchar(20) NOT NULL ,
 `typeName`      varchar(25) NOT NULL ,
PRIMARY KEY (`accountTypeId`)
);






-- ************************************** `Date`

CREATE TABLE `Date`
(
 `dateId`       int NOT NULL ,
 `attrName`     varchar(45) ,
 `createDate`   datetime ,
 `startDate`    date ,
 `postedDate`   date ,
 `lastDate`     date ,
 `endDate`      date ,
 `savedDate`    datetime ,
 `accountRef`   varchar(20) ,
 `educationId`  int ,
 `xpId`         int ,
 `activePeriod` int ,
PRIMARY KEY (`dateId`),
KEY `fkIdx_120` (`educationId`),
CONSTRAINT `FK_120` FOREIGN KEY `fkIdx_120` (`educationId`) REFERENCES `Education` (`educationId`),
KEY `fkIdx_123` (`xpId`),
CONSTRAINT `FK_123` FOREIGN KEY `fkIdx_123` (`xpId`) REFERENCES `Experinces` (`xpId`)
);






-- ************************************** `CVs`

CREATE TABLE `CVs`
(
 `cvId`           int NOT NULL ,
 `cvReference`    varchar(20) NOT NULL ,
 `accountRef`     varchar(20) ,
 `firstname`      varchar(30) NOT NULL ,
 `lastname`       varchar(30) NOT NULL ,
 `otherName`      varchar(50) NOT NULL ,
 `dateOfBirth`    varchar(12) NOT NULL ,
 `contactNumbers` varchar(13) NOT NULL ,
 `jobTitle`       varchar(40) ,
 `description`    varchar(600) ,
 `skillId`        int ,
 `educationId`    int ,
 `xpId`           int ,
PRIMARY KEY (`cvId`),
KEY `fkIdx_68` (`skillId`),
CONSTRAINT `FK_68` FOREIGN KEY `fkIdx_68` (`skillId`) REFERENCES `skills` (`skillId`),
KEY `fkIdx_74` (`educationId`),
CONSTRAINT `FK_74` FOREIGN KEY `fkIdx_74` (`educationId`) REFERENCES `Education` (`educationId`),
KEY `fkIdx_92` (`xpId`),
CONSTRAINT `FK_92` FOREIGN KEY `fkIdx_92` (`xpId`) REFERENCES `Experinces` (`xpId`)
);






-- ************************************** `Jobs`

CREATE TABLE `Jobs`
(
 `jobID`      int NOT NULL ,
 `jobTitle`   varchar(100) ,
 `jobDetails` varchar(900) ,
 `jobPeriod`  varchar(20) ,
 `jobTypeId`  int NOT NULL ,
 `dateId`     int NOT NULL ,
PRIMARY KEY (`jobID`),
KEY `fkIdx_186` (`jobTypeId`),
CONSTRAINT `FK_186` FOREIGN KEY `fkIdx_186` (`jobTypeId`) REFERENCES `JobType` (`jobTypeId`),
KEY `fkIdx_200` (`dateId`),
CONSTRAINT `FK_200` FOREIGN KEY `fkIdx_200` (`dateId`) REFERENCES `Date` (`dateId`)
);






-- ************************************** `ActiveJobs`

CREATE TABLE `ActiveJobs`
(
 `activeJobsId` int NOT NULL ,
 `activeRef`    varchar(20) NOT NULL ,
 `jobRef`       varchar(20) NOT NULL ,
 `isActive`     varchar(10) NOT NULL ,
 `savedRef`     varchar(20) ,
 `jobTypeRef`   varchar(20) NOT NULL ,
 `dateId`       int NOT NULL ,
PRIMARY KEY (`activeJobsId`),
KEY `fkIdx_205` (`dateId`),
CONSTRAINT `FK_205` FOREIGN KEY `fkIdx_205` (`dateId`) REFERENCES `Date` (`dateId`)
);






-- ************************************** `Accounts`

CREATE TABLE `Accounts`
(
 `accountId`     int NOT NULL ,
 `accountRef`    varchar(20) NOT NULL ,
 `accountcvRef`  varchar(20) NOT NULL ,
 `isActivated`   varchar(10) NOT NULL ,
 `accountTypeId` int NOT NULL ,
 `userId_1`      int NOT NULL ,
 `cvId`          int NOT NULL ,
PRIMARY KEY (`accountId`),
KEY `fkIdx_24` (`accountTypeId`),
CONSTRAINT `FK_24` FOREIGN KEY `fkIdx_24` (`accountTypeId`) REFERENCES `AccountType` (`accountTypeId`),
KEY `fkIdx_33` (`userId_1`),
CONSTRAINT `FK_33` FOREIGN KEY `fkIdx_33` (`userId_1`) REFERENCES `Users` (`userId`),
KEY `fkIdx_62` (`cvId`),
CONSTRAINT `FK_62` FOREIGN KEY `fkIdx_62` (`cvId`) REFERENCES `CVs` (`cvId`)
);






-- ************************************** `SavedJobs`

CREATE TABLE `SavedJobs`
(
 `savedJobId`  int NOT NULL ,
 `savedJobRef` varchar(20) ,
 `accountRef`  varchar(20) ,
 `jobID`       int NOT NULL ,
 `appliedId`   int NOT NULL ,
PRIMARY KEY (`savedJobId`),
KEY `fkIdx_174` (`jobID`),
CONSTRAINT `FK_174` FOREIGN KEY `fkIdx_174` (`jobID`) REFERENCES `Jobs` (`jobID`),
KEY `fkIdx_177` (`appliedId`),
CONSTRAINT `FK_177` FOREIGN KEY `fkIdx_177` (`appliedId`) REFERENCES `Applied` (`appliedId`)
);






-- ************************************** `Address`

CREATE TABLE `Address`
(
 `addressId`  int NOT NULL ,
 `accountRef` varchar(20) NOT NULL ,
 `cvRef`      varchar(20) NOT NULL ,
 `xpRef`      varchar(20) NOT NULL ,
 `city`       varchar(45) NOT NULL ,
 `town`       varchar(45) NOT NULL ,
 `country`    varchar(45) NOT NULL ,
 `zipCode`    varchar(10) NOT NULL ,
 `postalCode` varchar(10) NOT NULL ,
 `cvId`       int ,
 `jobID`      int NOT NULL ,
PRIMARY KEY (`addressId`),
KEY `fkIdx_126` (`cvId`),
CONSTRAINT `FK_126` FOREIGN KEY `fkIdx_126` (`cvId`) REFERENCES `CVs` (`cvId`),
KEY `fkIdx_189` (`jobID`),
CONSTRAINT `FK_189` FOREIGN KEY `fkIdx_189` (`jobID`) REFERENCES `Jobs` (`jobID`)
);






-- ************************************** `AccountImages`

CREATE TABLE `AccountImages`
(
 `accountImagesId` int NOT NULL ,
 `accountId`       int ,
 `photos`          binary ,
PRIMARY KEY (`accountImagesId`),
KEY `fkIdx_39` (`accountId`),
CONSTRAINT `FK_39` FOREIGN KEY `fkIdx_39` (`accountId`) REFERENCES `Accounts` (`accountId`)
);






-- ************************************** `Companies`

CREATE TABLE `Companies`
(
 `companyId`       int NOT NULL ,
 `companyRef`      varchar(20) ,
 `companyName`     varchar(30) ,
 `accountImagesId` int NOT NULL ,
 `IId`             int NOT NULL ,
PRIMARY KEY (`companyId`),
KEY `fkIdx_153` (`IId`),
CONSTRAINT `FK_153` FOREIGN KEY `fkIdx_153` (`IId`) REFERENCES `Industries` (`IId`),
KEY `fkIdx_48` (`accountImagesId`),
CONSTRAINT `FK_48` FOREIGN KEY `fkIdx_48` (`accountImagesId`) REFERENCES `AccountImages` (`accountImagesId`)
);





