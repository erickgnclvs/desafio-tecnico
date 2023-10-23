/*
 * An XML document type.
 * Localname: getProfissoes
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetProfissoesDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getProfissoes(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetProfissoesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetProfissoesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfissoesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFISSOES$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getProfissoes");
    
    
    /**
     * Gets the "getProfissoes" element
     */
    public br.jus.tjsc.www.selo.GetProfissoes getGetProfissoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetProfissoes target = null;
            target = (br.jus.tjsc.www.selo.GetProfissoes)get_store().find_element_user(GETPROFISSOES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProfissoes" element
     */
    public void setGetProfissoes(br.jus.tjsc.www.selo.GetProfissoes getProfissoes)
    {
        generatedSetterHelperImpl(getProfissoes, GETPROFISSOES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProfissoes" element
     */
    public br.jus.tjsc.www.selo.GetProfissoes addNewGetProfissoes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetProfissoes target = null;
            target = (br.jus.tjsc.www.selo.GetProfissoes)get_store().add_element_user(GETPROFISSOES$0);
            return target;
        }
    }
}
