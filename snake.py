
import time
import random
#def print (snake):

import snake

snake = ("snake game")
print("snake") 

# Dimension of window
width = 400
height = 300

screen = snake.display.set_mode((width, height))

snake.display.set_caption('Snake Game')


c = snake.time.Clock("snake game")

snake_block = 10
snake_speed = 15

font_style = snake.font.SysFont("calibri", 50)
score_font = snake.font.SysFont("calibri", 20)


def Your_score(score):
    value = score_font.render("Your Score: " + str(score), True, (0, 0, 0))
    screen.blit(value, [0, 0])


# Function to draw snakes
def snake(snake_block, snake_list):
    for x in snake_list:
        snake.draw.rect(screen, (0, 200, 0), [x[0], x[1], snake_block, snake_block])


# Function to print the message
def message(msg, color):
    mesg = font_style.render(msg, True, color)
    screen.blit(mesg, [width / 6, height / 3])


# Function for game loop
def gameLoop():
    game_over = False
    game_close = False

    x1 = width / 2
    y1 = height / 2

    x1_change = 0
    y1_change = 0

    snake_List = []
    Length_of_snake = 1

    # Defining food parameters
    foodx = round(random.randrange(0, width - snake_block) / 10.0) * 10.0
    foody = round(random.randrange(0, height - snake_block) / 10.0) * 10.0

    # Game Loop
    running = True
    while running:

        while game_close == True:
            screen.fill((0, 0, 0))
            message("You Lost!", (200, 0, 0))
            snake.display.update()

        #Loop for events
        for event in snake.event.get():
            # Quit event
            if event.type == snake.QUIT:
                running = False
            #Keyboard arrow event
            if event.type == snake.KEYDOWN:
                if event.key == snake.K_LEFT:
                    x1_change -= snake_block
                    y1_change = 0
                elif event.key == snake.K_RIGHT:
                    x1_change += snake_block
                    y1_change = 0
                elif event.key == snake.K_UP:
                    y1_change -= snake_block
                    x1_change = 0
                elif event.key == snake.K_DOWN:
                    y1_change += snake_block
                    x1_change = 0

        #Setting the boundaries
        if x1 >= width or x1 < 0 or y1 >= height or y1 < 0:
            game_close = True
        x1 += x1_change
        y1 += y1_change
        screen.fill((200, 200, 200))

        #Drawing the food
        snake.draw.rect(screen, (0, 0, 0), [foodx, foody, snake_block, snake_block])

        snake_Head = []
        snake_Head.append(x1)
        snake_Head.append(y1)
        snake_List.append(snake_Head)
        if len(snake_List) > Length_of_snake:
            del snake_List[0]

       #For snake to not hit it's own body
        for x in snake_List[:-1]:
            if x == snake_Head:
                game_close = True


        snake(snake_block, snake_List)
        Your_score(Length_of_snake - 1)

        snake.display.update()

        
        if x1 == foodx and y1 == foody:
            #Making to appear food at random position
            foodx = round(random.randrange(0, width - snake_block) / 10.0) * 10.0
            foody = round(random.randrange(0, height - snake_block) / 10.0) * 10.0
            #increasing the length of snake
            Length_of_snake += 1

        
        c.tick(snake_speed)
    
    snake.quit()
    quit()


gameLoop()