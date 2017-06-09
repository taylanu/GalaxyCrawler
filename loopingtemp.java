//looping over all enemies
//call repaint every time that the iterator adds.

int enemyCount = enemies.length;
for(int i = 0; i < enemyCount; i++){

if ((enemies[i]!=null && Math.abs((enemies[i].getX()+20)-mx)<20) && (Math.abs((enemies[i].getY()+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile
				collision1 = true;
			if (collision1==true)
			{
				my = -1;
				enemies[0] = null;
				score += 250;
				collision1 = false;
			}

}

// GRAVEYARD


/*  if ((enemies[i]!=null && Math.abs((enemies[i].getX()+20)-mx)<20) && (Math.abs((enemies[i].getY()+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision1 = true;
         if (collision1==true)
         {
            my = -1;
            enemies[0] = null;
            score += 250;
            collision1 = false;
         }
       /*  if ((enemies[1]!=null && Math.abs((ex2+20)-mx)<20) && (Math.abs((ey2+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision2 = true;
         if (collision2==true)
         {
            my = -1;
            enemies[1] = null;
            score += 250;
            collision2 = false;
         }
         if ((enemies[2]!=null && Math.abs((ex3+20)-mx)<20) && (Math.abs((ey3+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision3 = true;
         if (collision3==true)
         {
            my = -1;
            enemies[2] = null;
            score += 250;
            collision3 = false;
         }
         if ((enemies[3]!=null && Math.abs((ex4+20)-mx)<20) && (Math.abs((ey4+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision4 = true;
         if (collision4==true)
         {
            my = -1;
            enemies[3] = null;
            score += 500;
            collision4 = false;
         }
      
         if ((enemies[4]!=null && Math.abs((ex5+20)-mx)<20) && (Math.abs((ey5+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision5 = true;
         if (collision5==true)
         {
            my = -1;
            enemies[4] = null;
            score += 250;
            collision5 = false;
         }
         if ((enemies[5]!=null && Math.abs((ex6+20)-mx)<20) && (Math.abs((ey6+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision6 = true;
         if (collision6==true)
         {
            my = -1;
            enemies[5] = null;
            score += 500;
            collision6 = false;
         }
         if ((enemies[6]!=null && Math.abs((ex7+20)-mx)<20) && (Math.abs((ey7+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision7 = true;
         if (collision7==true)
         {
            my = -1;
            enemies[6] = null;
            score +=250;
            collision7 = false;
         }
         if ((enemies[7]!=null && Math.abs((ex8+20)-mx)<20) && (Math.abs((ey8+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision8 = true;
         if (collision8==true)
         {
            my = -1; 
            enemies[7] = null;
            score += 250;
            collision8 = false;
         }
         if ((enemies[8]!=null && Math.abs((ex9+20)-mx)<20) && (Math.abs((ey9+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision9 = true;
         if (collision9==true)
         {
            my = -1;
            enemies[8] = null;
            score += 250;
            collision9 = false;
         }
         if ((enemies[9]!=null && Math.abs((ex10+20)-mx)<20) && (Math.abs((ey10+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision10 = true;
         if (collision10==true)
         {
            my = -1;
            enemies[9] = null;
            score += 250;
            collision10 = false;
         }
         if ((enemies[10]!=null && Math.abs((ex11+20)-mx)<20) && (Math.abs((ey11+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision11 = true;
         if (collision11==true)
         {
            my = -1;
            enemies[10] = null;
            score += 250;
            collision11 = false;
         }
         if ((enemies[11]!=null && Math.abs((ex12+20)-mx)<20) && (Math.abs((ey12+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision12 = true;
         if (collision12==true)
         {
            my = -1;
            enemies[11] = null;
            score += 250;
            collision12 = false;
         }
         if ((enemies[12]!=null && Math.abs((ex13+20)-mx)<20) && (Math.abs((ey13+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision13 = true;
         if (collision13==true)
         {
            my = -1;
            enemies[12] = null;
            score += 250;
            collision13 = false;
         }
         if ((enemies[13]!=null && Math.abs((ex14+20)-mx)<20) && (Math.abs((ey14+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision14 = true;
         if (collision14==true)
         {
            my = -1;
            enemies[13] = null;
            score += 250;
            collision14 = false;
         }
         if ((enemies[14]!=null && Math.abs((ex15+20)-mx)<20) && (Math.abs((ey15+20)-my)<20)) // do collision detection here, on collision (missile & enemy), add 1 to the score, remove the missile, start the enemy ship at a new random location
            collision15 = true;
         if (collision15==true)
         {
            my = -1;
            enemies[14] = null;
            score += 250;
            collision15 = false;
         }*/
