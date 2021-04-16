var config = {
  type: Phaser.AUTO,
  width: 800,
  height: 600,
  physics: {
      default: 'arcade',
      arcade: {
          gravity: { y: 200 }
      }
  },

  // scene is denotes my game area
  scene: {
      preload: preload, // it is for that you can load every object(filelike(.txt, .ext, music)) in memory before working
      create: create // every file we load in our memory using preload should be added in our screen to show how it is looking  
  }
};

var game = new Phaser.Game(config);

function preload ()
{
  this.load.setBaseURL('http://labs.phaser.io');

  this.load.image('sky', 'assets/skies/space3.png');
  this.load.image('logo', 'assets/sprites/phaser3-logo.png');
  this.load.image('red', 'assets/particles/red.png');
}

function create ()
{
  this.add.image(400, 300, 'sky');

  var logo = this.physics.add.image(400, 100, 'logo');

  logo.setVelocity(100, 200);
  logo.setBounce(1, 1);
  logo.setCollideWorldBounds(true);
}