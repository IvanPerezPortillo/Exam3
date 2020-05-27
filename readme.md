## La Figura
Volem fer una estructura d’Herència tal i com es veu:  
figura--> figura 2D, linea  
figura 2D-->cercle, Rectangle  
- Totes  les  figures  tenen  un color que és el color amb el que es pinten les vores. Dit color ve representat per un objecte de tipus Color de la llibreria  Java.  Dit  color s’especifica en el moment de la creació de la Figura. Han d’existir  operacions  per  a obteniri modificardit color. 
- Les    figures    en    dos dimensions a demés posseeixen un color d’emplenament (cas. relleno). Això també és altre color que també es defineix a la seua creació. També pot obtenir-se i modificar-se.
-Totes  les  figures  tenen  la  opció  dedibuixar.  Aquesta  operació no  està implementadani en Figura ni en Figura2D, i dibuixa la corresponent figura en les altres classes. Per no complicar-ho,en compte de dibuixar escriurem el nom de la Classe, junt als color de vora i emplenament.
- Les altresfigures disposaran dels seus atributs propis:   
Cercle ->centre i radio  
Rectangle -> vèrtex inferior esquerre i superior dreto  
Recta ->dos punts per on passa
- Els punts es representaran amb la classe de llibreria de Java Point, que són dos coordenades enteres
- Totes les figures desposen d’un mètode anomenat perímetre()
- La Figura2D disposarà d’un mètode area(). Retornarà el àrea de la mateix.

## Es demana  
Implementar l’arbre d’herència amb les seues consideracions. Els constructors deuen seguir els següents prototips: 
- public Figura(Color c)  
- public Figura2D(Color vora,Color dins)  - public Linia(Point x, Point y, Color c)  - public Cercle(Point centre, int  r, Color vora, Color dins)  
- public Rectangle(Point infEsq, Point supDret, Color vora, Color dins)

Per a comprobar  
 ` Linea l=new Linea(new Point(3, 2), new Point(0,9), Color.red);
        l.Dibuixar();
        
        Cercle c=new Cercle(new Point(4,2),20, Color.gray, Color.pink);
        c.Dibuixar();
        
        Rectangle r=new Rectangle(new Point(0,2),new Point(3, 9), Color.gray, Color.pink);
        r.Dibuixar();
        
        System.out.println("El perimetre de la linea es " + l.perimetre());
        
        System.out.println("El perimetre del rectangle es " + r.perimetre());
        System.out.println("El area del rectangle es " + r.area());
        
        System.out.println("El perimetre del cercle es " + c.perimetre());
        System.out.println("El area del cercle es " + c.area());`.
