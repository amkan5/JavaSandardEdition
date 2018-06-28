select * from tab;
select count(*) as "���̺��Ǽ�" 
from tab;

select TEAM_name,team_id as "��ü �౸�� ���"
from team
order by team_name desc;

select distinct 
nvl2(position,position,'����') position 
from player;

select player_name �̸�
from player
where team_id = 'K02'
 and position = 'GK'
order BY player_name
;
select position ������, player_name �̸�
from player
where team_id like 'K02'
 and height >= 170
 and substr(player_name,1,1) like '��';
 
 select position ������, player_name �̸�
from player
where team_id like 'K02'
 and height >= 170
 and player_name like '��__';

select substr(player_name,0,1)
from player;
 
select concat(player_name,'����') �̸�, concat(nvl2(height,height,0),'cm') Ű, concat(nvl2(weight,weight,0),'kg') ������
from player
where team_id like 'K02'
order by height desc
;
 
select player_name ||'����' �̸�, concat(nvl2(height,height,0),'cm') Ű, concat(nvl2(weight,weight,0),'kg') ������, round(weight/((height*0.01)*(height*0.01)),2) BMI
from player
where team_id like 'K02'
order by height desc
; 

select t.team_name, p.player_name
from team t, player p
where t.team_id = p.team_id
 and t.team_id in('K02','K10')
 and p.position like 'GK'
 order by t.team_name;

select p.height || 'cm', t.team_name, p.player_name
from player p
inner join team t
on t.team_id like p.team_id
 where t.team_id in('K02','K10')
 and p.height between 180 and 183
 order by p.height, t.TEAM_NAME,p.player_name;
 
 select p.height || 'cm', t.team_name, p.player_name
from player p
join team t
on t.team_id like p.team_id
 where t.team_id in('K02','K10')
 and p.height between 180 and 183
 order by p.height, t.TEAM_NAME,p.player_name;

select 
    t.team_name, 
    p.player_name
from player p
join team t
on t.team_id like p.team_id
 
where p.position is null
order by t.team_name, p.player_name;

select t.team_name, s.stadium_name
from stadium s
join team t
on t.stadium_id like s.stadium_id
order by t.team_name;
--012
select 
    t.team_name ����, 
    s.stadium_name ��Ÿ���, 
    c.awayteam_id ������ID, 
    c.SCHE_DATE �����ٳ�¥
from stadium s
    join team t
        on t.stadium_id like s.stadium_id
    join schedule c
        on s.stadium_id like c.stadium_id
where c.sche_date like '20120317'
order by t.team_name;
--013
select 
    p.player_name ������, 
    p.position ������, 
    t.region_name||' '||t.team_name ����, 
    s.stadium_name ��Ÿ���, 
    c.sche_date �����ٳ�¥
from team t
    join player p
        on t.team_id like p.team_id
    join schedule c
        on t.stadium_id like c.stadium_id
    join stadium s
        on t.stadium_id like s.stadium_id
where c.sche_date like '20120317'
    and t.team_id like (SELECT t.team_id from team t where team_name like '��ƿ����')
    and p.position like 'GK'
order by p.player_name;

--014
select
    s.stadium_name ��Ÿ���,
    c.sche_date ��⳯¥,
    t.region_name ||' '|| t.team_name Ȩ��,
    t2.region_name ||' '||t2.team_name ������,
    c.home_score Ȩ������,
    c.away_score ����������
from stadium s
    join schedule c
        on s.stadium_id like c.STADIUM_ID
    join team t
        on t.stadium_id like s.stadium_id
    join team t2
        on t2.team_id like c.awayteam_id
where c.home_score-c.away_score >= 3
order by c.sche_date;

--0015
select 
    distinct s.stadium_name, 
    s.stadium_id, 
    s.seat_count, 
    s.hometeam_id, 
    t.e_team_name
 from stadium s
    left join team t
        on t.stadium_id like s.stadium_id
 order by hometeam_id;

SELECT 
    T.TEAM_NAME ����,
    P.PLAYER_NAME ������,
    P.POSITION ������,
    P.BACK_NO ��ѹ�,
    P.HEIGHT Ű
FROM PLAYER P
    JOIN TEAM T
        ON P.TEAM_ID LIKE T.TEAM_ID
WHERE 
    T.TEAM_ID IN (SELECT t.team_id from team t where team_name IN('�巡����','�Ｚ�������')) 
;


select
    (select t.team_name from team t where t.team_id like 
    (select p.team_id from player p where p.player_name like '��ȣ��')) ���̸�,
    p.position ������,
    p.back_no ��ѹ�
from player p
where p.player_name like '��ȣ��';
    
select
   round(sum(p.height)/count(p.height),2) ���Ű
from player p
where p.team_id like (select t.team_id from team t where team_name like '��Ƽ��')
    and p.position like 'MF';

select count(sc.sche_date) �Ͽ� from schedule sc where sc.sche_date like '201201%';
select count(sc.sche_date) �̿� from schedule sc where sc.sche_date like '201202%';
select count(sc.sche_date) ��� from schedule sc where sc.sche_date like '201203%';
select count(sc.sche_date) ��� from schedule sc where sc.sche_date like '201204%';
select count(sc.sche_date) ���� from schedule sc where sc.sche_date like '201205%';
select count(sc.sche_date) ���� from schedule sc where sc.sche_date like '201206%';
select count(sc.sche_date) ĥ�� from schedule sc where sc.sche_date like '201207%';
select count(sc.sche_date) �ȿ� from schedule sc where sc.sche_date like '201208%';
select count(sc.sche_date) ���� from schedule sc where sc.sche_date like '201209%';
select count(sc.sche_date)�ʿ� from schedule sc where sc.sche_date like '201210%';
select count(sc.sche_date) ���Ͽ� from schedule sc where sc.sche_date like '201211%';
select count(sc.sche_date) ���̿� from schedule sc where sc.sche_date like '201212%';


select
    (select count(sc.sche_date) �Ͽ� from schedule sc where sc.sche_date like '201201%') �Ͽ�,
    (select count(sc.sche_date) �̿� from schedule sc where sc.sche_date like '201202%') �̿�,
    (select count(sc.sche_date) ��� from schedule sc where sc.sche_date like '201203%') ���
from schedule sc;


