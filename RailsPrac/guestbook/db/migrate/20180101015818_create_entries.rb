class CreateEntries < ActiveRecord::Migration[5.1] # ActiveRecord deals with all the database interactions.
  def change # 
		create_table :entries do |t| #
			t.string :name
			t.timestamps
		end
  end
end
