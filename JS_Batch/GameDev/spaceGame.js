var config = {
  type: Phaser.AUTO,
  width: 800,
  height: 600,
  physics: {
      default: 'arcade',
  },
  scene: {
      preload: preload,
      create: create,
      update: update //checks the requirements of the functions in a loop
  }
};
var sky, jet, cursors, ammo, bomb;
var game = new Phaser.Game(config);

function preload() {
  this.load.image('sky', 'http://labs.phaser.io/assets/skies/space3.png');
  this.load.image('jet', 'assets/jet.png');
  this.load.image('bomb', 'assets/bomb.png');
  this.load.image('ammo', 'assets/ammo.png');
  this.load.image('coin', 'assets/coin.png')
}

function create() {
  sky = this.add.image(400, 300, 'sky');
  jet = this.physics.add.image(400, 500, 'jet').setScale(0.15).setOrigin(0.5, 0) //resize the jet and to set its origin
  jet.setCollideWorldBounds(true) // so that our jet would not get out of the boundary

  cursors = this.input.keyboard.createCursorKeys(); // create all the cursor keys for moving jet
  this.input.on('pointerdown', shoot, this)

  bomb = this.physics.add.group({
      key: 'bomb',
      repeat: 3,
      setXY: {
          x: 20, y: 50, stepX: Phaser.Math.Between(10, config.width - 15), stepY: Phaser.Math.Between(15, 300)
      }
  })


}

function shoot() {
  ammo = this.physics.add.image(jet.x, jet.y, 'ammo').setScale(0.1)
  ammo.setRotation(-Phaser.Math.PI2 / 4);
  ammo.setVelocityY(-600)
  this.physics.add.collider(ammo, bomb, destroyBomb, null, this)
}

function destroyBomb(ammo, bomb) {
  bomb.disableBody(true, true)
  ammo.disableBody(true, true)
}

function update() { // for the control from the keyboard
  if (cursors.left.isDown) {
      jet.setVelocityX(-150);
  } else if (cursors.right.isDown) {
      jet.setVelocityX(150);
  } else {
      jet.setVelocityX(0);
  }

  if (cursors.up.isDown) {
      jet.setVelocityY(-150);
  } else if (cursors.down.isDown) {
      jet.setVelocityY(150);
  } else {
      jet.setVelocityY(0);
  }
}
