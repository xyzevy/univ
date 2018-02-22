#include <string>
#include <vector>

#include "Category.h"
#include "Listing.h"

Category(void);
	Category(int parent, string name);

	virtual int getNumber(void) const;
	virtual int getParent(void) const;
	virtual string getName(void) const;

	virtual void setNumber(int);
	virtual void setParent(int);
	virtual void setName(string);

	virtual void addSubCategory(Category*);
	virtual void addItem(int);

    virtual void findOfferings (Listing::iterator start,
					Listing::iterator finish, Listing &matches);
    virtual void findOfferingsRecursive (Listing::iterator start,
					Listing::iterator finish, Listing &matches);

	virtual vector<int>::iterator itemsBegin();
	virtual vector<int>::iterator itemsEnd();
	virtual vector<Category*>::iterator subCategoriesBegin();
	virtual vector<Category*>::iterator subCategoriesEnd();

	virtual bool operator==(const Category& rhs);
